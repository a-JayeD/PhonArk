# PhonArk
# 📱💻 Wireless PC ↔ Phone Control

Control your Android phone **securely and wirelessly** from your PC.
No cloud. No tracking. No Google Assistant limits.

---

## ✨ What is this?

This project lets you **control your Android phone from your PC** over local Wi‑Fi.

You can:

* 📞 Make and receive phone calls from your PC
* 💬 Send SMS (even scheduled ones)
* 🔔 Read phone notifications on PC
* 📲 Open apps remotely
* 🤖 Automate actions Google Assistant can’t

All communication stays **inside your local network**.

---

## 🔐 How is this secure? (Simple explanation)

Security is built like a **smart door lock**, not blind trust.

### 1️⃣ Manual confirmation on phone

When a PC wants to connect:

* Phone shows a pop‑up
* You must tap **Allow**

No silent access. Ever.

---

### 2️⃣ One‑time pairing code

* Phone shows a **random number**
* You enter it on PC within **60 seconds**

This proves **you are physically present** on both devices.

---

### 3️⃣ Secret session key (automatic)

After pairing:

* Phone and PC create a **hidden secret key**
* This key is never shown or reused

Even someone on the same Wi‑Fi **cannot read or fake commands**.

---

### 4️⃣ Locked communication

Every command is:

* Locked before sending
* Unlocked only by your phone

Outsiders see meaningless data.

---

### 5️⃣ Auto‑disconnect for safety

Connection is closed automatically when:

* App restarts
* Phone reboots
* Wi‑Fi changes
* You tap disconnect

No permanent access.

---

## 🚫 What this project does NOT do

* ❌ No cloud servers
* ❌ No background spying
* ❌ No auto‑pairing
* ❌ No Google Play tracking
* ❌ No iOS support

This is **local‑first and privacy‑first**.

---

## 🧠 Who is this for?

* Power users
* Developers
* Students & researchers
* Anyone frustrated with assistant limitations

Not aimed at casual users (yet).

---

## ⚙️ High‑level architecture

```
PC App  ⇄  Encrypted Local Connection  ⇄  Android App
```

* No internet required
* Works over Wi‑Fi or local network

---

## 📦 Distribution

Due to Android system permissions:

* ❌ Google Play Store
* ✅ Direct APK install
* ✅ GitHub releases
* ✅ F‑Droid (planned)

---

## ⚠️ Disclaimer

This project uses **Android Accessibility and system permissions**.

You:

* Must explicitly grant permissions
* Can revoke access anytime

Transparency > convenience.

---

## 🚧 Project status

* 🔨 Under active development
* 🔐 Security‑first design
* 🧪 Features added step‑by‑step

---

## 🤝 Contributions

Pull requests and discussions are welcome.
Security reviews are especially appreciated.

---

## 📜 License

Open‑source. Privacy‑respecting.
License details coming soon.

---

> ⚡ This is not just an app.
> It’s a **local control system** for people who want real power — safely.
