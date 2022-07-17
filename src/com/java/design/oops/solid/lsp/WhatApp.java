package com.java.design.oops.solid.lsp;

public class WhatApp implements SocialMedia {

	@Override
	public void chatWithFriend() {

	}

	@Override
	public void publishPost(Object post) {
		/**
		 * Not Supported Feature
		 */

		/*
		 * This feature is not supported by this class thence this class can't be
		 * substitute for the interface. Because of this it NOT fulfill the LSP.
		 * 
		 */

	}

	@Override
	public void sendPhotosAndVideos() {

	}

	@Override
	public void groupVideoCall(String users) {

	}

}
