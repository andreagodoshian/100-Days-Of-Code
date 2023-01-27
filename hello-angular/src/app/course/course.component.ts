import { Component } from '@angular/core';
import { CoursesService } from '../courses.service';

@Component({
  selector: 'app-course',
  template: `
    <h2>{{ 'Title: ' + getTitle() }}</h2>
    <ul>
      <li *ngFor="let x of courses">
        {{ x }}
      </li>
    </ul>
  `, // <-- backtick allows for multiple lines
  // {{}} <-- syntax
  // template: '<h2>{{"Title: " + title }}</h2>'
  styleUrls: ['./course.component.css'],
})

export class CourseComponent {
  title = 'List of courses';
  courses: any;

  constructor() {

    let service = new CoursesService();
    this.courses = service.getCourses();
  }

  getTitle() {
    return this.title;
  }
}