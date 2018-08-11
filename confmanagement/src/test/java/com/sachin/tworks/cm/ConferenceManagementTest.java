package com.sachin.tworks.cm;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.sachin.tworks.cm.Conference;
import com.sachin.tworks.cm.ConferenceScheduler;
import com.sachin.tworks.cm.InvalidTalkException;
import com.sachin.tworks.cm.Talk;

import junit.framework.Assert;

public class ConferenceManagementTest {
	
	@Test
	public void testConferenceManagementMultipleFullDayEvents() {

		System.out.println("testConferenceManagementMultipleFullDayEvents");

		try {
			Assert.assertEquals(2, testConferenceManagement("/input_file").getTracks().size());
		} catch (InvalidTalkException e) {

		}
	}

	
	@Test
	public void testConferenceManagementMultipleDayLessEvents() {
		try {
			System.out.println("testConferenceManagementMultipleDayLessEvents");
			Assert.assertEquals(1, testConferenceManagement("/input_file_less_events").getTracks().size());
		} catch (InvalidTalkException e) {

		}

	}

	@Ignore
	@Test
	public void testConferenceManagementEmptyList() {

		try {
			System.out.println("testConferenceManagementEmptyList");
			testConferenceManagement("/empty_list");
		} catch (InvalidTalkException e) {
			Assert.assertEquals("Empty Talk List", e.msg);
		}
	}

	@Ignore
	@Test
	public void testConferenceManagementInvalidTalkTime() {

		try {
			System.out.println("testConferenceManagementInvalidTalkTime");

			testConferenceManagement("/invalid_talk_time");
		} catch (InvalidTalkException e) {
			Assert.assertEquals("Invalid talk time, Overdoing it in Python 45hr. Time must be in mins or in lightning",
					e.msg);

		}
	}

	@Ignore
	@Test
	public void testConferenceExpected() throws IOException {
		try {
			Assert.assertEquals(null, testConferenceManagement("/input_file_single_day_events_expected"));
		} catch (InvalidTalkException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Ignore
	@Test
	public void testConferenceExpectedMultipleDays() throws IOException {
		try {
			Assert.assertEquals(null, testConferenceManagement("/input_file_single_day_events"));
		} catch (InvalidTalkException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Conference testConferenceManagement(String inputFile) throws InvalidTalkException {

		File resourcesDirectory = new File("src/test/resources" + inputFile);

		Conference talkList = null;
		ConferenceScheduler conferenceManager = new ConferenceScheduler();
		talkList = (Conference) conferenceManager.scheduleConference(resourcesDirectory.getAbsolutePath());

		return talkList;

	}

}
