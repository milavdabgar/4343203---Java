// Practical21.java - Demonstrate use of final class

// Final class - cannot be inherited
final class SecureConfig {
    private String serverName;
    private String password;
    private int port;
    private boolean isSSLEnabled;
    
    // Constructor
    public SecureConfig(String serverName, String password, int port) {
        this.serverName = serverName;
        this.password = password;
        this.port = port;
        this.isSSLEnabled = true;
    }
    
    // Public methods to access and modify configuration
    public String getServerName() {
        return serverName;
    }
    
    public int getPort() {
        return port;
    }
    
    public boolean isSSLEnabled() {
        return isSSLEnabled;
    }
    
    public void setSSLEnabled(boolean enabled) {
        this.isSSLEnabled = enabled;
    }
    
    // Method to display configuration (excluding sensitive data)
    public void displayConfig() {
        System.out.println("Server Configuration:");
        System.out.println("Server Name: " + serverName);
        System.out.println("Port: " + port);
        System.out.println("SSL Enabled: " + isSSLEnabled);
        System.out.println("Password: *****"); // Hide actual password
    }
    
    // Method to validate configuration
    public boolean validateConfig() {
        return serverName != null && !serverName.isEmpty() &&
               password != null && !password.isEmpty() &&
               port > 0 && port <= 65535;
    }
}

// This class would cause compilation error if uncommented:
/* 
class ExtendedConfig extends SecureConfig {  // Error: cannot inherit from final class
    private String additionalSetting;
    
    public ExtendedConfig(String serverName, String password, int port) {
        super(serverName, password, port);
    }
}
*/

public class Practical21 {
    public static void main(String[] args) {
        System.out.println("Demonstrating Final Class Usage:\n");
        
        // Create instances of SecureConfig
        SecureConfig config1 = new SecureConfig("prod-server-1", "secretpass123", 443);
        SecureConfig config2 = new SecureConfig("dev-server-1", "devpass456", 8080);
        
        // Demonstrate config1
        System.out.println("1. First Configuration:");
        config1.displayConfig();
        System.out.println("Configuration Valid: " + config1.validateConfig());
        
        // Modify SSL settings
        config1.setSSLEnabled(false);
        System.out.println("\nAfter modifying SSL settings:");
        config1.displayConfig();
        
        // Demonstrate config2
        System.out.println("\n2. Second Configuration:");
        config2.displayConfig();
        System.out.println("Configuration Valid: " + config2.validateConfig());
        
        // Demonstrate accessing individual properties
        System.out.println("\n3. Accessing Individual Properties:");
        System.out.println("Server Name: " + config2.getServerName());
        System.out.println("Port: " + config2.getPort());
        System.out.println("SSL Enabled: " + config2.isSSLEnabled());
        
        // Create array of configurations
        System.out.println("\n4. Processing Multiple Configurations:");
        SecureConfig[] configs = {config1, config2};
        
        for (int i = 0; i < configs.length; i++) {
            System.out.println("\nConfiguration " + (i + 1) + ":");
            configs[i].displayConfig();
        }
    }
}