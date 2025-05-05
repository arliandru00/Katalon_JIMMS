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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-qa.jasamarga.co.id/login')

WebUI.setText(findTestObject('Page_JIMMS - Sign In/input_Username'), 'admin')

WebUI.setText(findTestObject('Page_JIMMS - Sign In/input_Password'), '123')

WebUI.click(findTestObject('Page_JIMMS - Sign In/button_Login'))

WebUI.click(findTestObject('Page_JIMMS - Dashboard/button_settings'))

WebUI.click(findTestObject('Page_JIMMS - Dashboard/master_data'))

WebUI.click(findTestObject('Page_JIMMS - Dashboard/ruas'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_JIMMS - Ruas/add_data'))

WebUI.setText(findTestObject('Page_JIMMS - Ruas/1 input_Ruas'), 'Katalon Arliandru')

WebUI.click(findTestObject('Page_JIMMS - Ruas/2 input_Unit Kerja'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_JIMMS - Ruas/dropdown_Unit IT'))

WebUI.setText(findTestObject('Page_JIMMS - Ruas/3 input_Panjang (km)'), '100')

WebUI.setText(findTestObject('Page_JIMMS - Ruas/4 input_km awal'), '350')

WebUI.setText(findTestObject('Page_JIMMS - Ruas/5 input_km akhir'), '450')

WebUI.scrollToElement(findTestObject('Page_JIMMS - Ruas/button_Simpan'), 3)

WebUI.click(findTestObject('Page_JIMMS - Ruas/button_Simpan'))

WebUI.click(findTestObject('Page_JIMMS - Dashboard/button__profile'))

WebUI.click(findTestObject('Page_JIMMS - Dashboard/button_Log out'))

WebUI.closeBrowser()

