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

WebUI.openBrowser('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Page_Sign in - My Store/input_Email_signup'), 'niko1@mail.com')

WebUI.click(findTestObject('Page_Sign in - My Store/btn_signup'))

WebUI.click(findTestObject('Page_Login - My Store/label_Mr'))

WebUI.setText(findTestObject('Page_Login - My Store/input__customer_firstname'), 'nikolas')

WebUI.setText(findTestObject('Page_Login - My Store/input__customer_lastname'), 'lingga')

WebUI.setText(findTestObject('Page_Login - My Store/input__passwd_register'), '11223344')

WebUI.selectOptionByIndex(findTestObject('Page_Login - My Store/select_-days'), 2)

WebUI.selectOptionByIndex(findTestObject('Page_Login - My Store/select_-month'), 3)

WebUI.selectOptionByIndex(findTestObject('Page_Login - My Store/select_-year'), 20)

WebUI.click(findTestObject('Page_Login - My Store/label_Sign up for our newsletter'))

WebUI.click(findTestObject('Page_Login - My Store/label_Receive special offers from our partners'))

WebUI.setText(findTestObject('Page_Login - My Store/input__firstnameaddress'), 'nicolas')

WebUI.setText(findTestObject('Page_Login - My Store/input__lastname'), 'lingga')

WebUI.setText(findTestObject('Page_Login - My Store/input_Company_company'), 'Kata AI')

WebUI.setText(findTestObject('Page_Login - My Store/input__address1'), 'Jalan Cendrawasih no.38')

WebUI.setText(findTestObject('Page_Login - My Store/input__city'), 'Tangerang')

WebUI.selectOptionByLabel(findTestObject('Page_Login - My Store/select_-state'), 'Alaska', false)

WebUI.setText(findTestObject('Page_Login - My Store/input__postcode'), '12930')

WebUI.setText(findTestObject('Page_Login - My Store/input_Home phone_phone'), '021581818')

WebUI.setText(findTestObject('Page_Login - My Store/input__phone_mobile'), '0888881111')

WebUI.click(findTestObject('Page_Login - My Store/span_Register'))

WebUI.click(findTestObject('Page_My account - My Store/a_Sign out'))

