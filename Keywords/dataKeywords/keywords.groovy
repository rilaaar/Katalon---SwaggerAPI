package dataKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class keywords {

	@Keyword
	def static generatePetId() {
		int id = Math.abs(new Random().nextInt())
		GlobalVariable.petId = id
		println "Generated Pet ID: " + id
		return id
	}

	@Keyword
	def static generateRandomString(int length) {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
		Random rand = new Random()
		StringBuilder sb = new StringBuilder()
		for (int i = 0; i < length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())))
		}
		return sb.toString()
	}

	@Keyword
	def generateRandomUserId(int length) {
		String chars = "0123456789"
		StringBuilder sb = new StringBuilder()
		Random rand = new Random()

		for (int i = 0; i < length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())))
		}

		return sb.toString()
	}

	@Keyword
	def generateRandomUsername(int length) {
		String chars = "0123456789"
		StringBuilder sb = new StringBuilder()
		Random rand = new Random()

		for (int i = 0; i < length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())))
		}

		return "admin" + sb.toString()
	}


	@Keyword
	def generateRandomPassword(int length) {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#\$%^&*"
		StringBuilder sb = new StringBuilder()
		Random rand = new Random()

		for (int i = 0; i < length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())))
		}
		return "admin" + sb.toString()
	}

	@Keyword
	def generateRandomPhone(int length) {
		String chars = "0123456789"
		StringBuilder sb = new StringBuilder()
		Random rand = new Random()

		for (int i = 0; i < length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())))
		}

		return "62" + sb.toString()
	}
}
