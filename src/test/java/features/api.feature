Feature: Test Automation Rest API

  @api
  Scenario: Test Get List Data Normal
    Given prepare url for "GET_LIST_USER"
    And hit api get list user
    Then validation status code is equals 200
    Then validation response body get list users
    Then Validation response json with JSONSchema "get_list_users_normal.json"

    @negatif
    Scenario: Test Create User Email Already taken
      Given prepare url for "CREATE_NEW_USER"
      And hit api post create new user
#      Then validation status code is equals 422
#      Then validation response body create new users
#      Then message error "has already taken"
