@api
Feature: API Testing

  @get-list
  Scenario: [Positive] Get list of users
    Given prepare valid url for "GET_LIST_USERS"
    And hit api get list users
    Then validation status code is equal 200
    Then validation response body get list of users
    Then validation response json with JSONSchema "get_list_users_normal.json"

  @user-id
  Scenario: [Positive] Get data users by user id
    Given prepare valid url for "GET_USER_BY_ID"
    And hit api get users by id
    Then validation status code is equal 200

  @create-new-users
  Scenario: [Positive] Create new user
    Given prepare valid url for "CREATE_NEW_USERS"
    And hit api post create new user
    Then validation status code is equal 201
    Then validation response body post create new users
    Then validation response json with JSONSchema "post_create_new_user_normal.json"

  @update-user
  Scenario: [Positive] Update user by id
    Given prepare valid url for "UPDATE_USERS"
    And hit api update user
    Then validation status code is equal 200

  @delete-user
  Scenario: [Positive] Delete user by id
    Given prepare valid url for "CREATE_NEW_USERS"
    And hit api post create new user
    Then validation status code is equal 201
    Then validation response body post create new users
    And hit api delete new
    Then validation status code is equal 204

  @create-new-users-empty-gender
  Scenario: [Negative] Create new user with empty gender
    Given prepare valid url for "CREATE_NEW_USERS"
    And hit api post create new user with empty gender
    Then validation status code is equal 422

  @create-new-users-empty-email
  Scenario: [Negative] Create new user with empty email
    Given prepare valid url for "CREATE_NEW_USERS"
    And hit api post create new user with empty email
    Then validation status code is equal 422