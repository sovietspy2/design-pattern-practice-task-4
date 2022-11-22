### Design pattern practice task #2

---

The goal of this task is to add new behaviour based on the requirements. 

You **NEED** to refactor the code and add new behavior but the functionality needs to be the same. 

Comments will indicate whether a class or method is allowed to be changed or not.

Requirements:

- Refactor the code to use a _fitting_ design pattern!
- API is returning exception find out why and implement a fix!
- Implement changes to _hb-application_ project!
- Do not change anything in the image-host-library project! You can think of it as third party dependency.
- Feel free to add and remove files based on the rules specified earlier.
- You can run the `hb-application/src/main/java/com/epam/Application.java` to test if the code still works.

<details>
  <summary>Hints (Check this if you feel stuck)</summary>
  <ul>
    <li>There are duplicate code parts.
    <li>The image-host-library have a restriction of providing 3 API calls each time.
    <li>You are trying to make 4 calls, there is room for optimization.
    <li>Notice that you are doing the same API call multiple times!
    <li>If you are not familiar with design patterns: <a href="https://springframework.guru/gang-of-four-design-patterns/">click here</a>
    </ul>
</details>

<details>
  <summary>Hints #2 (Check this if you feel REALLY stuck)</summary>
  <ul>
    <li>There is a structural design pattern that can help you.
    <li>You need to implement a cache, find a fitting pattern for that!
  </ul>
</details>