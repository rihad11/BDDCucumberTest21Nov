Feature: login functionality
  I want to login to the application

  Background: user navigates to the page
    Given user in login page

  @regression
  Scenario: check login is suucessful
    When user enters username and password
    And user click on signIn button
    Then user successfully login
 

  @smoke
  Scenario: check login is successful by first param
    When user enters "raki.hasan" and "Abc!234"
    And user click on signIn button
    Then user successfully login
    

  @sanity
  Scenario: check login is successful by second param
    When user enters "raki.hasan2" and "Abc!23487"
    And user click on signIn button
    Then user successfully login


  @ddt
  Scenario Outline: check login is successful by ddt
    When user enters "<username>" and "<password>"
    And user click on signIn button
    Then user successfully login
   

    Examples: 
      | username       | password   |
      | aliSyed        | zxz45545   |
      | expertengineer | dfgfdgrtrt |
