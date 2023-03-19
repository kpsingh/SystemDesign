package com.java.design.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * https://leetcode.com/problems/design-add-and-search-words-data-structure/description/
 */

public class WordDictionary {

	TrieNode_1 root;

	public WordDictionary() {
		root = new TrieNode_1();
	}

	public void addWord(String word) {

		TrieNode_1 node = root;

		for (int i = 0; i < word.length(); i++) {

			Character ch = word.charAt(i);

			if (!node.containsKey(ch)) {

				node.put(ch, new TrieNode_1());
			}
			node = node.get(ch);
		}
		node.setIsEndNode(true);

	}

	public boolean search(String word) {

		return searchInNode(word, root);
	}

	public boolean searchInNode(String word, TrieNode_1 node) {

		for (int i = 0; i < word.length(); i++) {

			Character ch = word.charAt(i);

			if (!node.containsKey(ch)) {
				if (ch == '.') {
					// get the all character present and check in each of them
					Set<Character> keySet = node.keySet();

					for (Character c : keySet) {
						TrieNode_1 child = node.get(c);
						if (searchInNode(word.substring(i + 1), child)) {
							return true;
						}

					}
				} else {
					return false;
				}

			} else {
				node = node.get(ch);
			}

			node = node.get(ch);
		}

		return node.getIsEndNode();

	}

}

class TrieNode_1 {

	private Map<Character, TrieNode_1> map;

	private boolean isEndNode;

	TrieNode_1() {
		map = new HashMap<>();
		isEndNode = false;

	}

	public void put(Character ch, TrieNode_1 node) {
		map.put(ch, node);
	}

	public TrieNode_1 get(Character ch) {
		return map.get(ch);
	}

	public boolean containsKey(Character ch) {
		return map.containsKey(ch);
	}

	public void setIsEndNode(boolean b) {
		isEndNode = b;
	}

	public boolean getIsEndNode() {
		return isEndNode;
	}

	public Set<Character> keySet() {
		return map.keySet();
	}

}