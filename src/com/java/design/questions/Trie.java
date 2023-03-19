package com.java.design.questions;

/*
 * https://leetcode.com/problems/implement-trie-prefix-tree/
 * 
 */
public class Trie {

	TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public void insert(String word) {

		TrieNode node = root;

		for (int i = 0; i < word.length(); i++) {

			char ch = word.charAt(i);

			if (!node.containsKey(ch)) {
				node.put(ch, new TrieNode());
			}
			node = node.get(ch);
		}

		node.setEndNode(true);

	}

	public boolean search(String word) {

		TrieNode node = root;

		for (int i = 0; i < word.length(); i++) {

			char ch = word.charAt(i);

			if (!node.containsKey(ch)) {
				return false;
			}
			node = node.get(ch);
		}

		return node.isEndNode() == true ? true : false;
	}

	public boolean startsWith(String prefix) {

		TrieNode node = root;

		for (int i = 0; i < prefix.length(); i++) {

			char ch = prefix.charAt(i);

			if (!node.containsKey(ch)) {
				return false;
			}
			node = node.get(ch);
		}

		return node != null ? true : false;

	}

	public static void main(String[] args) {

		boolean isFound = false;

		Trie trie = new Trie();
		trie.insert("apple");

		isFound = trie.search("apple"); // return True
		System.out.println(isFound);

		isFound = trie.search("app"); // return False
		System.out.println(isFound);

		isFound = trie.startsWith("app"); // return True
		System.out.println(isFound);

		trie.insert("app");

		isFound = trie.search("app"); // return True
		System.out.println(isFound);
	}

}

class TrieNode {

	private TrieNode[] arr;

	private boolean endNode;

	public TrieNode() {
		arr = new TrieNode[26];
		endNode = false;
	}

	public boolean containsKey(Character c) {
		return arr[c - 'a'] != null;
	}

	public TrieNode get(Character c) {
		return arr[c - 'a'];
	}

	public void put(Character c, TrieNode node) {
		arr[c - 'a'] = node;
	}

	public boolean isEndNode() {
		return endNode;
	}

	public void setEndNode(boolean endNode) {
		this.endNode = endNode;
	}

}