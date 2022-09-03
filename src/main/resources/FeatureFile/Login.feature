Feature: Login Functionality

  Scenario Outline: Login with valid username and password as positive test
    Given User navigate to website
    When User enter valid "<username>" and "<password>"
    Then User should login successfully

  Examples:
  | username          | password     |
  | qwerty@asdfgh.com | 789512358Gfb |
