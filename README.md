
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