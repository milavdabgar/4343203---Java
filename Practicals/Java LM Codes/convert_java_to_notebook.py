import os
import json
from glob import glob
import re

def create_notebook_cell(cell_type, content, metadata=None):
    """Create a notebook cell of specified type"""
    if metadata is None:
        metadata = {}
    
    cell = {
        "cell_type": cell_type,
        "metadata": metadata,
        "source": content if isinstance(content, list) else content.splitlines(True)
    }
    
    if cell_type == "code":
        cell["outputs"] = []
        cell["execution_count"] = None
        
    return cell

def extract_practical_number(filename):
    """Extract practical number from filename"""
    match = re.search(r'Practical(\d+)', filename)
    return int(match.group(1)) if match else 0

def create_jupyter_notebook(java_files):
    """Create a Jupyter notebook from Java files"""
    notebook = {
        "cells": [
            create_notebook_cell("markdown", "# Java Programming Practicals\n\nThis notebook contains all Java programming practicals.\n")
        ],
        "metadata": {
            "kernelspec": {
                "display_name": "Java",
                "language": "java",
                "name": "java"
            },
            "language_info": {
                "codemirror_mode": "java",
                "file_extension": ".java",
                "mimetype": "text/x-java-source",
                "name": "Java",
                "pygments_lexer": "java",
                "version": "11"
            }
        },
        "nbformat": 4,
        "nbformat_minor": 4
    }
    
    for file_path in sorted(java_files, key=extract_practical_number):
        with open(file_path, 'r') as f:
            content = f.read()
            
        practical_name = os.path.basename(file_path).replace('.java', '')
        
        # Add markdown cell for practical title
        notebook["cells"].append(
            create_notebook_cell("markdown", f"## {practical_name}")
        )
        
        # Add code cell for Java code
        notebook["cells"].append(
            create_notebook_cell("code", content)
        )
        
        # Add execution line
        notebook["cells"].append(
            create_notebook_cell("code", f"{practical_name}.main(null);")
        )
    
    return notebook

def create_markdown(java_files):
    """Create a markdown file from Java files"""
    markdown_content = "# Java Programming Practicals\n\n## Table of Contents\n"
    
    markdown_content += "\n## Practicals\n"
    
    # Add each practical
    for file_path in sorted(java_files, key=extract_practical_number):
        with open(file_path, 'r') as f:
            content = f.read()
            
        practical_name = os.path.basename(file_path).replace('.java', '')
        markdown_content += f"\n### {practical_name}\n"
        markdown_content += "```java\n"
        markdown_content += content
        markdown_content += "\n```\n"
    
    return markdown_content

def main():
    # Get all Java files in the current directory
    java_files = glob("*.java")
    
    if not java_files:
        print("No Java files found in the current directory!")
        return
    
    # Create and save Jupyter notebook
    notebook = create_jupyter_notebook(java_files)
    with open("JavaPracticals.ipynb", "w") as f:
        json.dump(notebook, f, indent=2)
    print("Created JavaPracticals.ipynb")
    
    # Create and save Markdown file
    markdown_content = create_markdown(java_files)
    with open("JavaPracticals.md", "w") as f:
        f.write(markdown_content)
    print("Created JavaPracticals.md")

if __name__ == "__main__":
    main()