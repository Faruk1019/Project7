Feature: Add New Address Functionality

  Scenario Outline: Add New Address
    Given User navigate to website
    When User enter valid "qwerty@asdfgh.com" and "789512358Gfb"
    Then User navigate to Manage Account page
    When  User create "<Address>" "<City>" "<State>" "<ZipCode>" "<Country>"
    Then Add new address success message should be displayed

    Examples:
      | Address      | City | State      | ZipCode | Country       |
      | 11 Garden St | Lodi | New Jersey | 07111   | United States |
      | 11 th St     | Abc  | New York   | 07112   | United States |
      | 11 Flower St | Def  | California | 07113   | United States |