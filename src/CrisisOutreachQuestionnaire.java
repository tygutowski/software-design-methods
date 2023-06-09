/*
 * Author:  Tyler Gutowski, Thomas Johnson, Trevor Schiff
 * Course:  CSE 3421, Section 01, Spring 2023
 * Project: Software Design Project
 * Charset: US-ASCII
 */

import java.util.HashMap;

/**
 * Main menu
 */
public final class CrisisOutreachQuestionnaire extends MenuBase {
	CrisisOutreachForm form = null;
	public CrisisOutreachQuestionnaire() {
		form = new CrisisOutreachForm(LoginMenu.student);
		addOption(this::enterMood,  // handler
				  "mood",        // name
				  "Enter your mood from [1, 10]",
				  new Arg("mood", "")); // description

		addOption(this::enterSymptoms, // handler
				  "symptoms",              // name
			   	  "Explain in a single word what your symptom is",
			   	  new Arg("symp", ""));
		addOption(this::submitForm, // handler
				  "submit",              // name
			   	  "Submit your questionnaire");
	}
	// Submit the form to be processed by counselor

	public Boolean submitForm(final HashMap<String, String> args) {
		System.out.println("Form submitted. You will be contacted shortly by a counselor!");
		CrisisOutreachMenu.form_list.add(form);
		return false;
	}
	// Submit mood from 1 to 10
	public Boolean enterMood(final HashMap<String, String> args) {
		form.mood = args.get("mood");
		System.out.println("Your mood of '" + args.get("mood") + "' has been submitted");
		return false;
	}
	// Submit symptoms as a String
	public Boolean enterSymptoms(final HashMap<String, String> args) {
		form.symptoms = args.get("symp");
		System.out.println("Your symptom of '" + args.get("symp") + "' has been submitted");
		return false;
	}
	
	public String getName() {
		return "Crisis Outreach Questionnaire";
	}
}
