## Overview

Wasn't able to put all the test cases in the Json file due to losing the original collection and needint to do it at the last minute.

But listed is all the tests I performed. 

## Test Cases

| Test ID | Feature | Endpoint | Method | Input | Expected Result | Actual Result | Status |
|--------|--------|--------|--------|--------|--------|--------|--------|
| TC1 | Student CRUD | /api/students | GET | none | Returns list of students | Returned empty list initially | Pass |
| TC2 | Student CRUD | /api/students | POST | Valid student JSON | Student added successfully | Student created successfully | Pass |
| TC3 | Student CRUD | /api/students | GET | none | Returns saved students | Returned created student | Pass |
| TC4 | Course CRUD | /api/courses | POST | Valid course JSON | Course added successfully | Course created successfully | Pass |
| TC5 | Course CRUD | /api/courses | GET | none | Returns course list | Returned created course | Pass |
| TC6 | Business Rule | /api/courses/addStudent/1 | PUT | Student ID 1 | Student added to course | Student added successfully | Pass |
| TC7 | Business Rule | /api/courses/getEnrollment/1 | GET | none | Enrollment increases | Correct enrollment returned | Pass |
| TC8 | Business Rule | /api/courses/addStudent/1 | PUT | Student ID 2 | Student added | Student added successfully | Pass |
| TC9 | Business Rule | /api/courses/addStudent/1 | PUT | Student ID 3 | Student added | Student added successfully | Pass |
| TC10 | Business Rule | /api/courses/removeStudent/1 | PUT | Student ID 2 | Student removed | Student removed successfully | Pass |
| TC11 | Business Rule | /api/courses/getEnrollment/1 | GET | none | Enrollment decreases | Correct enrollment returned | Pass |
| TC12 | Error Condition | /api/courses/removeStudent/1 | PUT | Student ID 99 | Error returned | Error message returned | Pass |
| TC13 | Error Condition | /api/students | POST | GPA = 5.0 | Reject invalid GPA | 400 Bad Request | Pass |
| TC14 | Error Condition | /api/students | POST | GPA = -1.0 | Reject invalid GPA | 400 Bad Request | Pass |