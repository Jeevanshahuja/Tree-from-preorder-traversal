# Construct Binary Search Tree from Preorder Traversal  

## Problem Description  
Given an array of integers `preorder` representing the preorder traversal of a Binary Search Tree (BST), construct the tree and return its root.  

### Properties of a Binary Search Tree (BST)  
- All values in the left subtree of a node are strictly less than the node's value.  
- All values in the right subtree of a node are strictly greater than the node's value.  

### Input  
- An integer array `preorder` representing the preorder traversal of the BST.  

### Output  
- The root of the constructed BST.  

## Solution  

### Function: `bstFromPreorder(int[] preorder)`  
- **Input**:  
  - `int[] preorder`: Array representing preorder traversal of the BST.  
- **Output**:  
  - Returns the root of the constructed BST.  
- **Approach**:  
  - Initialize the root with the first value in the preorder array.  
  - For each subsequent value, insert it into the BST using a helper function that maintains BST properties.  

### Function: `helper(TreeNode root, int key)`  
- **Purpose**: Inserts a new node with the value `key` into the BST.  
- **Input**:  
  - `TreeNode root`: The current node in the tree where the insertion is being attempted.  
  - `int key`: The value to be inserted into the BST.  
- **Output**: Returns the updated node after insertion.  

### Time Complexity  
- **Time Complexity**: `O(N^2)` in the worst case for a skewed tree, where `N` is the length of the `preorder` array.  
- **Space Complexity**: `O(H)` for recursion stack, where `H` is the height of the BST.  

## Link to Problem  
For more details, visit the problem on [LeetCode](https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/description/).  
