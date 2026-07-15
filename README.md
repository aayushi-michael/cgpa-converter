# 🎓 CGPA Converter

A Java Swing-based desktop application that converts CGPA (Cumulative Grade Point Average) into multiple grading scales — including the 10-point scale, 4.0 scale, 5.0 scale, and percentage — with conversion history tracking and automated report generation.

> Course Project | B.Tech Electronics & Computer Engineering | St. Joseph's College of Engineering & Technology, Palai | April 2025

---

## 📖 Overview

Different educational institutions across the world follow distinct grading systems, making it difficult for students to interpret their academic performance across various scales. This application eliminates manual conversion errors by providing a standardized, GUI-based method for converting CGPA into equivalent scores — useful for higher education admissions, job applications, and academic assessments.

## ✨ Features

- 🖥️ Simple, intuitive GUI built with **Java Swing**
- 🔄 Converts CGPA to **4.0 scale, 5.0 scale, and Percentage**
- 📜 Maintains a **conversion history** during the session
- 📄 **Automated report generation** compiling all past conversions
- ⚠️ Input validation with error handling for invalid (non-numeric) entries

## 🖼️ Screenshots

| Input Screen | Output Screen |
|---|---|
| CGPA entry with grading scale dropdown | Converted results with history log |

## 🛠️ Tech Stack

- **Language:** Java
- **GUI Framework:** Java Swing (`javax.swing`, `java.awt`)
- **Core Concepts:** OOP, Event-driven programming, Collections (`HashMap`, `ArrayList`)

## ⚙️ Conversion Formula

```
Converted CGPA = (Input CGPA / 10) × Target Scale
```

## 🚀 Getting Started

### Prerequisites
- JDK 8 or higher installed
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or a terminal

### Run it locally

```bash
# Clone the repository
git clone https://github.com/aayushi-michael/cgpa-converter.git
cd cgpa-converter

# Compile
javac CGPAConverterGUI.java

# Run
java CGPAConverterGUI
```

## 🧠 Algorithm

1. Display the GUI
2. Prompt the user to enter their CGPA
3. Provide a dropdown to select the target grading scale
4. Validate the CGPA input (numeric check)
5. Retrieve the conversion factor for the selected scale
6. Apply the conversion formula
7. Display the converted result
8. Store the result in conversion history
9. On request, compile and display a structured report

## 🔮 Future Enhancements

- Integration with university APIs to fetch grading policies dynamically
- Support for additional international grading systems
- Export reports as PDF or Excel
- User-defined custom grading scales
- ML-based GPA equivalence prediction using historical trends

Department of Electronics & Computer Engineering, St. Joseph's College of Engineering & Technology, Palai (APJ Abdul Kalam Technological University)

## 📄 License

This project was developed as an academic course project and is shared for educational and portfolio purposes.
