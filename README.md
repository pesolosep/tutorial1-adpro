
### Muhammad Faishal Adly Nelwan
### AdPro-C/2206030754
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=pesolosep_tutorial1-adpro&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=pesolosep_tutorial1-adpro)

<details>
<summary> Modul 1</summary>
## Refleksi 1

I've applied the concepts of clean coding on this tutorial by:
* Using meaningful variables thus not needing unnecessary comments
* Using functions to reduce code duplication
* Private attributes AND not returning null for security
* Giving whitespaces using blank lines and proper indentation for readability

Throughout doing this tutorial, i've had a long time adapting to the concept of MVC because of my lack of experience with it compared to PBP.

This code can be more improved upon by adding Authtentication and Authorization features. Also, a more concrete error handling wouldn't hurt.


## Refleksi 2

1. I felt more secure by knowing that my program worked on the tests i've created. This automation testing system knowledge would surely help me in my future projects. A 100 percent code coverage doesn't actually mean my code is perfect. There is always a loop hole. To be honest i don't know the sure-fire way to test my code, so i can't answer how much is enough to verify our program. Maybe until the user-experience survey scenarios is all  handled?

2. I believe the new functional test would be quite redundant because it is breaking the DRY principle, the previous functional tests have already handled the number of items in the list implicitly.

</details>

<details>
<summary> Modul 2</summary>

### 1. Code issues from code analysis
- not adding description to table in productlist.html (reliability)

To fix it i added the `` <caption>`` tag under the table code to specify what the table is

```html
<table border="1" class="table table-striped table-responsive-md">
    <caption>Product Table</caption>
```

### 2. CI/CD Workflows
Menurut saya, implementasi _workflows_ pada program saya sudah memenuhi definisi CI/CD. CI/CD memungkinkan terjadinya
_testing_ program dan _deployment_ secara otomatis. Dengan menggunakan _github workflows_, program saya bisa
menjalani _testing_ setiap kali terjadi push di suatu branch. Proses testing dalam _workflow_ CI ini melibatkan
langkah-langkah seperti checkout code, setup Java toolchain, dan eksekusi unit tests menggunakan Gradle wrapper.
Selain itu PMD dalam workflow lain menjalankan pengujian keamanan dan analisis kode yang lebih mendalam. Kode yang
sudah benar kemudian akan di merge ke branch main dan otomatis deploy ke Paas Koyeb.


</details>

<details>
<summary>Modul 3</summary>

## Reflection

### SOLID Principles

1. I applied the principles of the Single Responsibility Principle (SRP) and Dependency Inversion Principle (DIP) to my this tutorial.

- SRP suggests that each class should have a single responsibility. For instance, I separated the CarController and ProductController to ensure that each focuses on a distinct area of functionality.
- DIP advocates for relying on abstractions rather than concrete implementations, which also informed my decision to keep CarController and ProductController distinct.

2. From my perspective, following the SOLID principles promotes a uniform approach among developers towards more maintainable code. Some advantages of applying the SOLID principles include:

- Prioritizing intuitive understanding over the sheer length of code. According to the Interface Segregation Principle (ISP), it's not the number of lines that matters, but how quickly one can grasp the purpose of a class or function. For example, splitting an interface with four methods into two interfaces with more descriptive names can make their purposes clearer.
- Organized code makes debugging, reading, and testing faster. The separation into specific classes like CarController and ProductController illustrates this point.
- Giving each function a single responsibility helps to clarify its role from its name alone. The division into classes like CarController and ProductController exemplifies this principle.
- It simplifies the addition of new features without affecting existing functionality or tests. For instance, introducing a new interface for a group of related classes allows for easy expansion and comparison in the future.
- It ensures that subclasses can be treated as their parent class, which is essential because the parent class represents a broader category that all subclasses should fit into. This means if class B inherits from class A, and we're comparing instances of A, class B should be usable in that context as well.

3. Long functions can hinder developer productivity for several reasons:

- The prospect of reading through a lengthy, complex function might be daunting, discouraging developers from even starting.
- Altering existing code can lead to changes in tests, undermining the confidence in the existing functionalities.
- Comprehending older, lengthy code can be time-consuming, especially if the function names do not intuitively convey their purpose.
- Introducing new features can become challenging, as it might involve extensive modifications to existing code, leading to redundancy.
</details>