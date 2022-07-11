import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

res = WS.sendRequest(findTestObject('GET/GET List Users page 1'))

def slurper = new JsonSlurper()

Map result = slurper.parseText(res.getResponseBodyContent())

for (int i = 0; i < result.size(); i++) {
	WS.verifyElementPropertyValue(res, ('data[' + i) + '].id', result.data[i].id)

	WS.verifyElementPropertyValue(res, ('data[' + i) + '].email', result.data[i].email)

	WS.verifyElementPropertyValue(res, ('data[' + i) + '].first_name', result.data[i].first_name)

	WS.verifyElementPropertyValue(res, ('data[' + i) + '].last_name', result.data[i].last_name)

	WS.verifyElementPropertyValue(res, ('data[' + i) + '].avatar', result.data[i].avatar)

	println(('data[' + i) + '].id')
}


