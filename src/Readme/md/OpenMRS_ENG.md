# OpenMRS

[OpenMRS](https://openmrs.org) (Open Medical Record System) is an open-source electronic medical record (EMR) system designed to improve healthcare delivery in low-resource settings. It is developed by a global community of health professionals and developers.

## Project Overview

OpenMRS, started in 2004, aims to help healthcare workers manage clinical data more efficiently. It facilitates the collection, storage, management, and reporting of patient health data, and its modular architecture allows customization.

### Key Features:
- Management of patient records
- Tracking clinical visits and patient statuses
- Managing laboratory results
- Health service reporting and analytics
- Modular structure for adding additional functionality

## System Requirements

To run OpenMRS, ensure the following:

- **Java Development Kit (JDK)**: Version 10 or higher
- **Selenium WebDriver**: Version 4.23.x or higher
- **TestNG**: Version 7.9.x or higher
- **Git**: Version control system
- **Supported browsers**: Google Chrome, Mozilla Firefox, Microsoft Edge, or Safari

# OpenMRS Test Procedures

## Features Under Test

### 1. Login to the System
#### 1.1 Error Handling
- **Objective**: Verify error messages when incorrect credentials are used.
- **Test Steps**:
    - Attempt to log in with incorrect credentials.
    - Confirm that an appropriate error message (e.g., "Incorrect username or password") is displayed.

#### 1.2 Successful Login
- **Objective**: Ensure proper system access with valid credentials.
- **Test Steps**:
    - Log in using correct username and password.
    - Verify redirection to the home page after successful login.

### 2. Logout from the System
- **Objective**: Ensure that users can successfully log out.
- **Test Steps**:
    - Log in and then log out.
    - Verify that the user is redirected to the login page after logging out.

### 3. Patient Records
#### 3.1 Searching for Patients
- **Objective**: Test the functionality of the patient search feature.
- **Test Steps**:
    - Search for a patient by name.
    - Verify that the correct patient details are displayed in the search results.

#### 3.2 Deleting a Patient Record
- **Objective**: Ensure that users can delete a patient's record.
- **Test Steps**:
    - Select a patient record and delete it.
    - Verify that the patient no longer appears in the patient list.

#### 3.3 Listing Patients
- **Objective**: Display all registered patients.
- **Test Steps**:
    - View the patient list.
    - Ensure all patients are displayed correctly.

#### 3.4 Merging Patient Records
- **Objective**: Test the merging of two patient records.
- **Test Steps**:
    - Select two patient records and merge them.
    - Verify that the data from both records is combined correctly.

### 4. Patient Appointments
#### 4.1 Handling Incorrect Time Zones
- **Objective**: Test error handling when booking an appointment with the wrong time zone.
- **Test Steps**:
    - Try to book an appointment in the wrong time zone.
    - Confirm the system shows the correct error message (e.g., "Please select the correct time zone").

## General Test Considerations
- Ensure that expected outcomes are met for all test cases.
- Confirm that error messages are displayed correctly when tests fail.
- Report test results and document any issues encountered.
