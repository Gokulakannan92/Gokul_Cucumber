

# Author: Babu Devanandam
# Feature: Launch Chrome browser and open a website


Feature: Chrome Browser Launch and URL Navigation


Background:
    Given Chrome browser is launched
    And user opens the URL "https://trytestingthis.netlify.app/"

  Scenario: Verify website is opened successfully
    Then the page title should be displayed