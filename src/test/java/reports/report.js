$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/0001.feature");
formatter.feature({
  "name": "Viewing front page of gazeta portal",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a user I want to see landing page of gazeta",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I opened gazeta landing site",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.MyStepdefs.iOpenedGazetaLandingSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on accept cookie button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.MyStepdefs.iClickOnAcceptCookieButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate that header site elements are available",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.MyStepdefs.iValidateThatHeaderSiteElementsAreAvailable()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});