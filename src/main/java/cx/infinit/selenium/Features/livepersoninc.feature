@SmokeTest
Feature: Tests livepersoninc Chatbot Website

  # https://livepersoninc.github.io/visitor-page/?siteid=70057248
  @First
  Scenario: livepersonic Chatot Senario
    Given Webdriver Started
    Given Webdriver Properties are loadet
    # USE> cx.infinit.selenium.Uitities.DriverUtilities.setpropertys();
    When Webdriverlogger is in LogLevel Level.INFO
    Then user opens livepersoninc
    Then user opens LiveChat
    Then user waits for option Chatmenu
    # BOT
    # OPTIONS:
    #> READ
    #> SQL
    #> WRITE
    Then user sends Read in Massage Texfield
    #USER: <READ>
    Then user waits for first Succeeded
    # BOT
    # <Succeeded>
    Then user sends RESET in Massage Texfield
    #USER: <RESET>
    Then user waits for first Session deleted
    # BOT
    # <Session deleted>
    Then user sends SQL in Massage Texfield
    Then Close the browser
		# USE> Package: cx.infinit.selenium.Uitities.DriverUtilities.secureWebDriverClose(WebDriver driver);
