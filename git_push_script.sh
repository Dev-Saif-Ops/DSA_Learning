#!/bin/bash

# Initialize Git repository (if not already initialized)
git init

# Commit changes to the main branch
git add .
git commit -m "Initial commit"

# Set up remote repository
git remote add origin https://github.com/Dev-Saif-Ops/DSA_Learning.git

# Push changes to the remote repository
git push -u origin main

# Fetch and merge changes from the remote repository
git pull origin main --allow-unrelated-histories

# Resolve merge conflicts
git add .
git commit -m "Resolve merge conflicts"

# Push the resolved changes to the remote repository
git push origin main

# Print a success message
echo "Script execution completed successfully!"

