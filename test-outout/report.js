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
  "duration": 79701201,
  "status": "passed"
});
formatter.match({
  "location": "BotLivepersonincTest.webdriver_Properties_are_loadet()"
});
formatter.result({
  "duration": 1691759200,
  "status": "passed"
});
formatter.match({
  "location": "BotLivepersonincTest.webdriverlogger_is_in_LogLevel_Level_INFO()"
});
formatter.result({
  "duration": 27400,
  "status": "passed"
});
formatter.match({
  "location": "BotLivepersonincTest.user_opens_livepersoninc()"
});
formatter.result({
  "duration": 1270445399,
  "status": "passed"
});
formatter.match({
  "location": "BotLivepersonincTest.user_opens_LiveChat()"
});
formatter.result({
  "duration": 5979669000,
  "status": "passed"
});
formatter.match({
  "location": "BotLivepersonincTest.user_waits_for_option_Chatmenu()"
});
formatter.result({
  "duration": 12520904199,
  "status": "passed"
});
formatter.match({
  "location": "BotLivepersonincTest.user_sends_Read_in_Massage_Texfield()"
});
formatter.result({
  "duration": 295657600,
  "status": "passed"
});
formatter.match({
  "location": "BotLivepersonincTest.user_waits_for_first_Succeeded()"
});
formatter.result({
  "duration": 3807463601,
  "status": "passed"
});
formatter.match({
  "location": "BotLivepersonincTest.user_sends_RESET_in_Massage_Texfield()"
});
formatter.result({
  "duration": 8252955200,
  "status": "passed"
});
formatter.match({
  "location": "BotLivepersonincTest.user_waits_for_first_Session_deleted()"
});
formatter.result({
  "duration": 74451500,
  "status": "passed"
});
formatter.match({
  "location": "BotLivepersonincTest.user_sends_SQL_in_Massage_Texfield()"
});
formatter.result({
  "duration": 8270672801,
  "status": "passed"
});
formatter.match({
  "location": "BotLivepersonincTest.close_the_browser()"
});
formatter.result({
  "duration": 3469300,
  "status": "passed"
});
formatter.after({
  "duration": 679017501,
  "status": "passed"
});
});