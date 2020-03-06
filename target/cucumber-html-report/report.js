$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/LoginWithDataDrivenWithSqlFileAndConfigFileReading.feature");
formatter.feature({
  "line": 2,
  "name": "Login to facebook",
  "description": "",
  "id": "login-to-facebook",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginWithDataDrivenWithSqlFileAndConfigFileReading"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "login to facebook.com with data driven with Example Keyword having external data sources",
  "description": "",
  "id": "login-to-facebook;login-to-facebook.com-with-data-driven-with-example-keyword-having-external-data-sources",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "browser, url, username and password from configuration.properties \"\u003cpropertyFile\u003e\" file",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "query from sql \"\u003csqlFile\u003e\" file",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user should be able to login with authorized credential only",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Quit Browser with Sql File And Config File Reading",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-to-facebook;login-to-facebook.com-with-data-driven-with-example-keyword-having-external-data-sources;",
  "rows": [
    {
      "cells": [
        "propertyFile",
        "sqlFile"
      ],
      "line": 13,
      "id": "login-to-facebook;login-to-facebook.com-with-data-driven-with-example-keyword-having-external-data-sources;;1"
    },
    {
      "cells": [
        "configuration.properties",
        "Countries.sql"
      ],
      "line": 14,
      "id": "login-to-facebook;login-to-facebook.com-with-data-driven-with-example-keyword-having-external-data-sources;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "login to facebook.com with data driven with Example Keyword having external data sources",
  "description": "",
  "id": "login-to-facebook;login-to-facebook.com-with-data-driven-with-example-keyword-having-external-data-sources;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LoginWithDataDrivenWithSqlFileAndConfigFileReading"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "browser, url, username and password from configuration.properties \"configuration.properties\" file",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "query from sql \"Countries.sql\" file",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user should be able to login with authorized credential only",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Quit Browser with Sql File And Config File Reading",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "configuration.properties",
      "offset": 67
    }
  ],
  "location": "LoginWithDataDrivenWithSqlFileAndConfigFileReading.browser_url_username_and_password_from_configuration_properties_file(String)"
});
formatter.result({
  "duration": 279219600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Countries.sql",
      "offset": 16
    }
  ],
  "location": "LoginWithDataDrivenWithSqlFileAndConfigFileReading.query_from_sql_file(String)"
});
formatter.result({
  "duration": 874941200,
  "status": "passed"
});
formatter.match({
  "location": "LoginWithDataDrivenWithSqlFileAndConfigFileReading.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 70900,
  "status": "passed"
});
formatter.match({
  "location": "LoginWithDataDrivenWithSqlFileAndConfigFileReading.user_should_be_able_to_login_with_authorized_credential_only()"
});
formatter.result({
  "duration": 101200,
  "status": "passed"
});
formatter.match({
  "location": "LoginWithDataDrivenWithSqlFileAndConfigFileReading.quit_Browser()"
});
formatter.result({
  "duration": 81600,
  "status": "passed"
});
});