package com.vanderhighway.grrbac.patterns;

import org.eclipse.xtext.xbase.lib.Pure;

public class MyQueryUtil {
	
	@Pure
	public static int determineAuthenticationStatus(int lockedPriority, int protectedPriority, int unlockedPriority) {
		if(lockedPriority == -1 && protectedPriority == -1 && unlockedPriority == -1) {
			return AuthenticationStatus.PROTECTED.getStatusCode();
		}
		if(lockedPriority >= protectedPriority && lockedPriority >= unlockedPriority) {
			return AuthenticationStatus.LOCKED.getStatusCode();
		}
		else if(protectedPriority >= lockedPriority && protectedPriority >= unlockedPriority) {
			return AuthenticationStatus.PROTECTED.getStatusCode();
		}
		else {
			return AuthenticationStatus.UNLOCKED.getStatusCode();
		}
	}

}
