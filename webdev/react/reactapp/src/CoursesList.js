import React from 'react';

function CoursesList(props){
    return props.courses.map(function(course){
        return(
            <div key = {course.id}>
                <h2>{course.title}</h2>
                <p>Professor: {course.professor}</p>
                <p>Code: {course.courseCode}</p>
                <p>Schedule: {course.schedule}</p>
            </div>
        );
    });
}

export default CoursesList;