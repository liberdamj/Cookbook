import React from 'react';
import CoursesList from './CoursesList';

const courses = [
  {
    id: 1,
    title : "Software Engineering",
    professor : "David Crater",
    courseCode : "CIS322",
    schedule: "M/W/F 10:40-11:35",
    zoom: false
  },
  {
    id: 2,
    title: "Senior Seminar",
    professor: "John Eickemeyer",
    courseCode: "CIS492",
    schedule: "M/W/F 11:45-12:40",
    zoom: false
  },
  {
    id: 3,
    title: "English Literature 2",
    professor: "Kurt Hild",
    courseCode: "E212",
    schedule: "T/Th 12:45-14:10",
    zoom: true
  },
  {
    id: 4,
    title: "Geology Lab",
    professor: "Dannah MacLeod",
    courseCode: "GS150.L",
    schedule: "M 13:55-16:55",
    zoom: false
  }
];

function App() {
  return (
    <div>
      <h1>Course List</h1>
      <hr />
      <CoursesList courses={courses}></CoursesList>
    </div>
  );
}

export default App;
