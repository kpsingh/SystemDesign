package com.java.design.questions;

/*
 * https://leetcode.com/problems/implement-trie-prefix-tree/
 * 
 */
public class Trie {

	public Trie() {

	}

	public void insert(String word) {

	}

	public boolean search(String word) {

	}

	public boolean startsWith(String prefix) {

	}

	public static void main(String[] args) {

		Trie trie = new Trie();
		trie.insert("apple");
		trie.search("apple"); // return True
		trie.search("app"); // return False
		trie.startsWith("app"); // return True
		trie.insert("app");
		trie.search("app"); // return True
	}

}
