/*
 * Author:  Tyler Gutowski, Thomas Johnson, Trevor Schiff
 * Course:  CSE 3421, Section 01, Spring 2023
 * Project: Software Design Project
 * Charset: US-ASCII
 */


import java.util.HashMap;

public final class ApplicationMenu extends MenuBase {
	private static StudentLifeMenu studentTab;
	private static DoctorsNoteMenu doctorsNoteTab;
	private static CrisisOutreachMenu crisisOutreachTab;
	private static MeditationMenu meditationTab;	
	public ApplicationMenu() {
		addOption(this::eventHub, // handler
				 "1",        // name
				 "Event Hub");
		addOption(this::openDoctorsNote, // handler
				 "6",        // name
				 "Doctors Note Application");  
		addOption(this::openCrisisOutreach, // handler
				 "7",        // name
				 "Crisis Outreach");  
		addOption(this::openMeditation, // handler
				 "8",        // name
				 "Meditate");  
	}

	public String getName() {
		return "Login Menu";
	}
	
	private Boolean eventHub(final HashMap<String, String> args) {
		MenuManager.enterMenu(new StudentLifeMenu());
		return true;
	}

	private Boolean openDoctorsNote(final HashMap<String, String> args) {
		MenuManager.enterMenu(new DoctorsNoteMenu());
		return true;
	}
	private Boolean openCrisisOutreach(final HashMap<String, String> args) {
		MenuManager.enterMenu(new CrisisOutreachMenu());
		return true;
	}
	private Boolean openMeditation(final HashMap<String, String> args) {
		MenuManager.enterMenu(new MeditationMenu());
		return true;
	}
}
