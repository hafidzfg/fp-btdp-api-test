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
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.json.JsonSlurper as JsonSlurper
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

get_res = WS.sendRequestAndVerify(findTestObject('GET/GET a single user', [('userId') : userId]))

WS.verifyResponseStatusCode(get_res, 200)

def slurper = new JsonSlurper()

Map result = slurper.parseText(get_res.getResponseBodyContent())

WS.verifyElementPropertyValue(get_res, 'data.id', result.data.id)

println(result.data.id)

WS.verifyElementPropertyValue(get_res, 'data.email', result.data.email)

println(result.data.email)

WS.verifyElementPropertyValue(get_res, 'data.first_name', result.data.first_name)

println(result.data.first_name)

WS.verifyElementPropertyValue(get_res, 'data.last_name', result.data.last_name)

println(result.data.last_name)

WS.verifyElementPropertyValue(get_res, 'data.avatar', result.data.avatar)

println(result.data.avatar)

WS.verifyElementPropertyValue(get_res, 'support.url', result.support.url)

println(result.support.url)

WS.verifyElementPropertyValue(get_res, 'support.text', result.support.text)

println(result.support.text)

