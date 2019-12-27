package com.moowork.gradle.node.util;

import org.gradle.util.GradleVersion;


public class BackwardsCompat {

	private static boolean IS_GRADLE_MIN_45 = GradleVersion.current().compareTo(GradleVersion.version("4.5")) >= 0;
	private static boolean IS_GRADLE_MIN_50 = GradleVersion.current().compareTo(GradleVersion.version("5.0")) >= 0;

	public static boolean useMetadataSourcesRepository() {
		return IS_GRADLE_MIN_45;
	}

	public static boolean usePatternLayout() {
		return IS_GRADLE_MIN_50;
	}
}
