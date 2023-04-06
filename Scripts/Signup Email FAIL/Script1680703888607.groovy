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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('/Users/rizky/Katalon Studio/Touch Me/Apk/Touchme.apk', true)

Mobile.tap(findTestObject('Object Repository/Notif/View-signup'), 0)

Mobile.tap(findTestObject('Object Repository/Field/Full Name'), 0)

Mobile.setText(findTestObject('Field/Full Name'), 'kynaran', 0)

Mobile.tap(findTestObject('Object Repository/Field/Email'), 0)

Mobile.setText(findTestObject('Field/Email'), 'daftarnyadisini', 0)

Mobile.tap(findTestObject('Object Repository/Field/Password'), 0)

Mobile.setText(findTestObject('Field/Password'), 'AkuSelaluMencintaimu', 0)

Mobile.tap(findTestObject('Object Repository/Field/Repeat Password'), 0)

Mobile.setText(findTestObject('Field/Repeat Password'), 'AkuSelaluMencintaimu', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Notif/Button'), 0)

Mobile.verifyElementText(findTestObject('Notif/View Email Error'), '')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

