
### **DevFeed 📱 – Android Tech News App**  

---

## 🚀 **Overview**  
**DevFeed** is an **Android app** designed for developers and tech enthusiasts to stay updated with the latest **tech news, trends, and innovations** in software development, programming, and emerging technologies. Unlike traditional **newsletters**, DevFeed offers a **real-time, curated news experience** within a dedicated app.  

---

## 🛠️ **Tech Stack**  

| Component  | Technology Used  |
|------------|----------------|
| **Frontend** | XML (UI Design) |
| **Backend** | Kotlin (Similar to Java) |
| **Database** | Room DB (Local Storage) |
| **Networking** | Retrofit + OkHttp |
| **Tools** | Gradle (Build Automation) |
| **AI Model** | TensorFlow Lite (TFLite) |
| **Platform** | Android OS |

---

## 🎯 **Problem Statement**  
Developers and tech enthusiasts **lack a centralized mobile platform** to get **real-time** updates on the latest trends in:  
✅ Development Technologies  
✅ Tech Innovations  
✅ Software Engineering News  

Most people rely on **newsletters** or scattered sources, which are **inconvenient and lack personalization**. DevFeed solves this by **aggregating** and **customizing news feeds** based on user preferences.  

---

## 📌 **Features (Progress as of 26/03/2025)**  

✅ **Save Articles** – Users can bookmark articles to read later.  
✅ **Offline Mode** – Previously fetched articles remain accessible even without an internet connection.  
✅ **Duplicate Prevention** – Prevents repeated articles in both API responses and saved lists.  

---

### **How it Works:**  
1️⃣ **Store user interactions** (e.g., liked/saved articles) in Room DB.  
2️⃣ **Extract features** such as **article category and keywords**.  
3️⃣ **Convert article text** into numerical vectors using **TF-IDF (Term Frequency-Inverse Document Frequency)**.  
4️⃣ **Apply Content-Based Filtering (CBF)**:  
   - Uses **TF-IDF + Cosine Similarity** to recommend similar articles.  
5️⃣ **Train the model** using **TensorFlow Lite (TFLite)** for on-device predictions.  

---

## 🎯 **Real-World Use Cases**  
🔹 Helps **developers**, **tech enthusiasts**, and **freshers** stay updated with industry trends.  
🔹 Provides **AI-driven recommendations**, making news consumption **efficient and personalized**.  
🔹 **Offline reading** ensures accessibility even with **limited connectivity**.  

---

### Home Activity Fragment 
![Home](https://github.com/user-attachments/assets/4d19504d-6456-4c97-b619-c4c844ccce7d)



### Category View Fragment
![Category](https://github.com/user-attachments/assets/25ad8cfe-15fe-4a9b-bf21-d7051092e66a)


### Saved News Fragment
![Saved](https://github.com/user-attachments/assets/ca8ac1f4-10b3-4159-b079-6f54ca840cbd)



### SearchView
![Search](https://github.com/user-attachments/assets/3a3b292c-1c8e-4937-b2c7-75449f0abd98)


### Article View
![ArticleView](https://github.com/user-attachments/assets/89b3d844-0b21-43f3-ab1f-59034da1570e)
