$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/cx/infinit/selenium/Features/livepersoninc.feature");
formatter.feature({
  "line": 2,
  "name": "Tests livepersoninc Chatbot Website",
  "description": "",
  "id": "tests-livepersoninc-chatbot-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "# https://livepersoninc.github.io/visitor-page/?siteid\u003d70057248"
    }
  ],
  "line": 6,
  "name": "livepersonic Chatot Senario",
  "description": "",
  "id": "tests-livepersoninc-chatbot-website;livepersonic-chatot-senario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@First"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Webdriver Started",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Webdriver Properties are loadet",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "# USE\u003e cx.infinit.selenium.Uitities.DriverUtilities.setpropertys();"
    }
  ],
  "line": 10,
  "name": "Webdriverlogger is in LogLevel Level.INFO",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user opens livepersoninc",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user opens LiveChat",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user waits for option Chatmenu",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 14,
      "value": "# BOT"
    },
    {
      "line": 15,
      "value": "# OPTIONS:"
    },
    {
      "line": 16,
      "value": "#\u003e READ"
    },
    {
      "line": 17,
      "value": "#\u003e SQL"
    },
    {
      "line": 18,
      "value": "#\u003e WRITE"
    }
  ],
  "line": 19,
  "name": "user sends Read in Massage Texfield",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "#USER: \u003cREAD\u003e"
    }
  ],
  "line": 21,
  "name": "user waits for first Succeeded",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "# BOT"
    },
    {
      "line": 23,
      "value": "# \u003cSucceeded\u003e"
    }
  ],
  "line": 24,
  "name": "user sends RESET in Massage Texfield",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 25,
      "value": "#USER: \u003cRESET\u003e"
    }
  ],
  "line": 26,
  "name": "user waits for first Session deleted",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "# BOT"
    },
    {
      "line": 28,
      "value": "# \u003cSession deleted\u003e"
    }
  ],
  "line": 29,
  "name": "user sends SQL in Massage Texfield",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "BotLivepersonincTest.webdriver_Started()"
});
formatter.result({
  "duration": 75822700,
  "status": "passed"
});
formatter.match({
  "location": "BotLivepersonincTest.webdriver_Properties_are_loadet()"
});
formatter.result({
  "duration": 1720529400,
  "status": "passed"
});
formatter.match({
  "location": "BotLivepersonincTest.webdriverlogger_is_in_LogLevel_Level_INFO()"
});
formatter.result({
  "duration": 35000,
  "status": "passed"
});
formatter.match({
  "location": "BotLivepersonincTest.user_opens_livepersoninc()"
});
formatter.result({
  "duration": 1150223300,
  "status": "passed"
});
formatter.match({
  "location": "BotLivepersonincTest.user_opens_LiveChat()"
});
formatter.result({
  "duration": 6074797901,
  "status": "passed"
});
formatter.match({
  "location": "BotLivepersonincTest.user_waits_for_option_Chatmenu()"
});
formatter.result({
  "duration": 180248360900,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //p[contains(text(),\u0027OPTIONS:\u0027)] (tried for 180 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat cx.infinit.selenium.stepDefinitions.BotLivepersonincTest.user_waits_for_option_Chatmenu(BotLivepersonincTest.java:125)\r\n\tat ✽.Then user waits for option Chatmenu(src/main/java/cx/infinit/selenium/Features/livepersoninc.feature:13)\r\nCaused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//p[contains(text(),\u0027OPTIONS:\u0027)]\"}\n  (Session info: chrome\u003d94.0.4606.54)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027ICXNBR911RTM8\u0027, ip: \u0027192.168.2.122\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0-262\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 94.0.4606.54, chrome: {chromedriverVersion: 93.0.4577.63 (ff5c0da2ec0ad..., userDataDir: C:\\Users\\ADMINU~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:50211}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: a4033fbcf8089556a91d404899ed01ce\n*** Element info: {Using\u003dxpath, value\u003d//p[contains(text(),\u0027OPTIONS:\u0027)]}\r\n\tat sun.reflect.GeneratedConstructorAccessor10.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\r\n\tat cx.infinit.selenium.stepDefinitions.BotLivepersonincTest.user_waits_for_option_Chatmenu(BotLivepersonincTest.java:125)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:542)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:770)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:464)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BotLivepersonincTest.user_sends_Read_in_Massage_Texfield()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BotLivepersonincTest.user_waits_for_first_Succeeded()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BotLivepersonincTest.user_sends_RESET_in_Massage_Texfield()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BotLivepersonincTest.user_waits_for_first_Session_deleted()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BotLivepersonincTest.user_sends_SQL_in_Massage_Texfield()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BotLivepersonincTest.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 684400300,
  "status": "passed"
});
});