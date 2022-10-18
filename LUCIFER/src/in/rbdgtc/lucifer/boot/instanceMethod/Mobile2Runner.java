package in.rbdgtc.lucifer.boot.instanceMethod;

import in.rbdgtc.lucifer.programs.instanceMethod.Mobile2;

public class Mobile2Runner {

	public static void main(String[] args) {

		long[] mobileNumbers = { 8970877229l, 89708475596l };
		String[] entertainmentApps = { "NetFlix", "Amazon Prime", "Aha", "Zee5" };
		String[] googleApps = { "Google browser", "Google Drive", "Youtube", "Gmail" };
		String[] educationalApps = { "VisionIas", "Java Pattern Programs Free", "Brainly" };
		String[] bankingApps = { "PhonePe", "PayTM", "GooglePay" };
		String[] musicApps = { "Wynk music", "Spotify", "JioSaavn" };

		Mobile2 mobile = new Mobile2("OnePlus Nord", "Android", 12, 256, 11, mobileNumbers, entertainmentApps,
				googleApps, educationalApps, bankingApps, musicApps);

		mobile.display();

	}

}
