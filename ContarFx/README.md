# Counter(Contador)

## 🚀 Sobre
Está é uma aplicação que foi feita com o objetivo de `contar`. Você escolhe de qual número até qual número deseja contar, e também seus pulos. A aplicação utiliza as `bibliotecas javafx` e o `scene builder`.

<br>

## 🔎 Observação de execução
><b> <kbd> OBS:</kbd> </b> Caso a pessoa escolha o `fim` como menor número e o `começo` como maior número, o programa contará do `maior(início)` até o `menor(fim)`.
<div style="padding: 10px; border-left: 6px solid #cce2fe; color: #cce2fe" >
  <b> Telas: </b> 
</div>

<br>

## 📚 Instrução de instalação

### 📜 Pré-requisitos

- [JDK 21.0.2](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- [JavaFx](https://gluonhq.com/products/javafx/)
- [Scene Builder](https://gluonhq.com/products/scene-builder/)

<br>

## 👩‍💻 Tecnologias Utilizadas

- Java - Version: 21.0.2.
- Scene Builder.
- Para a criação do aplicativo: [Visual Studio Code](https://code.visualstudio.com/)

### ❗❗ ATENÇÃO
Você não precisa apenas utilizar o Visual Studio Code, você pode utilizar outras IDE's. Exemplo: [IntelliJ](https://lp.jetbrains.com/intellij-idea-features-promo/?source=google&medium=cpc&campaign=AMER_en_BR_IDEA_Branded&term=intellij&content=693349187724&gad_source=1&gclid=Cj0KCQjw-ai0BhDPARIsAB6hmP673F8TA-JX7HkziM3Bx9X35teYxXtzL45KqeaU1BCZYotVjb4yVGYaAr8sEALw_wcB), [Eclipse](https://www.eclipse.org/downloads/), [Netbeans](https://netbeans.apache.org/front/main/download/nb22/), etc.

<br>

## ❓ Como contribuir

```bash 
 # Clone the project 
 $ git clone https://github.com/evelyn-mendes/projetos-javafx.git
 # Clone inside in Git Bash 
```
<br>

## 🛠 Estrutura da Pasta

No workspace contém duas pastas por padrão, onde:

- `src`: a pasta para manter os aquivos
- `lib`: the folder to maintain dependencies

Enquanto isso, os arquivos compilados serão gerados na pasta `bin` por padrão.

> Se você quer customizar a estrutura de pastas, abra `.vscode/settings.json` e atualize as configurações relacionadas lá.

<br>

## Gerenciamento de Dependência

A visualização `JAVA PROJECTS` permite que você gerencie suas dependências. Mais detalhes podem ser encontrados [aqui](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

<br>

## ⚠️ Problemas encontrados

### Problema:
A execução falhou devido à `biblioteca javafx`. O vscode não conseguiu identificar onde estavam as bibliotecas.
> Tenha certeza que importou as [bibliotecas](https://github.com/microsoft/vscode-java-dependency#manage-dependencies)
- Para solucionar, entre em `.vscode/settings.json`, depois adicione o argumento `"vmArgs": "--module-path C:/javafx-sdk-21.0.2/lib --add-modules javafx.controls,javafx.fxml"` depois de "projectName: ".

  ***OBS:*** Mude o caminho da biblioteca, caso o caminho seja diferente.
### ❗❗ ATENÇÃO

Caso não tenha a pasta `.vscode/settings.json`, vá em "Executar/Adicionar Configurações".
<hr>








<details>
<summary> <h2> In English </h2> </summary> 

## About
This is a application who was made with the objective of `count`. You choice of which number until which number want to count, and the steps too. The application uses the `libraries javafx` and the `scene builder`.

<br>

## 🔎 Observação de execução
><b> <kbd> OBS:</kbd> </b> If one chooses `end` as the smallest number and `start` as the largest, the program will count from `largest(start)` to `lower(end)`.
<div style="padding: 10px; border-left: 6px solid #cce2fe; color: #cce2fe" >
  <b> Windows: </b> 
</div>


<br>

## 📚Instrução de instalação

### 📜Prerequisites

- [JDK 21.0.2](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- [JavaFx](https://gluonhq.com/products/javafx/)
- [Scene Builder](https://gluonhq.com/products/scene-builder/)

<br>

## 👨‍💻 Technologies Used
- Java - Version: 21.0.2.
- Scene Builder.
- For the criation of application: [Visual Studio Code](https://code.visualstudio.com/)

### ❗❗ ATTENTION
You don't just have to use Visual Studio, you can use others IDE's. Example: [IntelliJ](https://lp.jetbrains.com/intellij-idea-features-promo/?source=google&medium=cpc&campaign=AMER_en_BR_IDEA_Branded&term=intellij&content=693349187724&gad_source=1&gclid=Cj0KCQjw-ai0BhDPARIsAB6hmP673F8TA-JX7HkziM3Bx9X35teYxXtzL45KqeaU1BCZYotVjb4yVGYaAr8sEALw_wcB), [Eclipse](https://www.eclipse.org/downloads/), [Netbeans](https://netbeans.apache.org/front/main/download/nb22/), etc.

<br>

## ❓ How Contribute

```bash 
 # Clone the project 
 $ git clone https://github.com/evelyn-mendes/projetos-javafx.git
 # Clone inside in Git Bash 
```
<br>

## 🛠 Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management(Gerenciamento de Dependência)

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

<br>

## ⚠️ Problems faced

### Problem:
Execution failed due to the `javafx library`. The vscode was unable to identify where the libraries were.
> Make sure to import the [libraries](https://github.com/microsoft/vscode-java-dependency#manage-dependencies)
- For resolution, enter in `.vscode/settings.json`, after addicione argument `"vmArgs": "--module-path C:/javafx-sdk-21.0.2/lib --add-modules javafx.controls,javafx.fxml"` after "projectName: ".

  ***OBS:*** Change the path of libraries, case the path is different.
### ❗❗ Attention

Case have not folder `.vscode/settings.json`, go to "Execution/Addition Configurations".
</details>

<br>

## 📝 License
MIT License

Copyright (c) 2024 Evelyn Mendes

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
