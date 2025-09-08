import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class GeneralTestListener {
	
	@BeforeTestSuite
	def setRandomData() {
		GlobalVariable.randomUserId = generateRandomUserId(3)
		GlobalVariable.randomUsername = generateRandomUsername(3)
		GlobalVariable.randomPassword = generateRandomPassword(8)
		GlobalVariable.randomPhone = generateRandomPhone(12)
		
		println("Generated Random UserId: " + GlobalVariable.randomUserId)
		println("Generated Random Username: " + GlobalVariable.randomUsername)
		println("Generated Random Password: " + GlobalVariable.randomPassword)
		println("Generated Random Phone: " + GlobalVariable.randomPhone)
	}
	
		def generateRandomUserId(int length) {
		String chars = "0123456789"
		StringBuilder sb = new StringBuilder()
		Random rand = new Random()

		for (int i = 0; i < length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())))
		}

		return sb.toString()
	}
	
	def generateRandomUsername(int length) {
		String chars = "0123456789"
		StringBuilder sb = new StringBuilder()
		Random rand = new Random()

		for (int i = 0; i < length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())))
		}

		return "admin" + sb.toString()
	}
	

	
	def generateRandomPassword(int length) {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#\$%^&*"
		StringBuilder sb = new StringBuilder()
		Random rand = new Random()

		for (int i = 0; i < length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())))
		}
		return "admin" + sb.toString()
	}
	
	
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