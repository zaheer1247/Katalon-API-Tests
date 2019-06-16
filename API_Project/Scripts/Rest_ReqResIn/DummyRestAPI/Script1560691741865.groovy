import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Use this Request to Get Employee Details from DummyRestAPI website\r\n\r\nRef:\r\nhttp://dummy.restapiexample.com/api'
ResponseEmployee = WS.sendRequestAndVerify(findTestObject('DummyRestAPI/DummyRestAPIEmployees'))

WS.verifyResponseStatusCode(ResponseEmployee, 200)

WS.verifyElementsCount(ResponseEmployee, 'employee_name', 98)

'Use this Request to get the boolean response for Employee \r\n\r\nhttp://dummy.restapiexample.com/api/v1/employee/1'
not_run: ResponseEmployeeBoolean = WS.sendRequest(findTestObject('DummyRestAPI/DummyRestAPIBoolean'))

not_run: WS.verifyMatch(ResponseEmployeeBoolean, '', false)

