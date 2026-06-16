# LexiWorld — Multilingual Educator (MR + AI)

> XR Bootcamp · Prototype 03 · 2025

A **Mixed Reality prototype** that transforms your physical surroundings into a language learning environment. Using AI-powered object recognition, it detects real-world items in real time and overlays floating multilingual labels — letting you learn vocabulary from the objects already around you.

[![Watch the demo](https://img.youtube.com/vi/ONC5-dDK4K4/hqdefault.jpg)](https://youtube.com/shorts/ONC5-dDK4K4)

▶ [Watch demo on YouTube](https://youtube.com/shorts/ONC5-dDK4K4)

---

## Concept

Language learning is most effective in context. LexiWorld removes flashcards and apps from the equation — instead, the user looks at a real chair, a cup, or a window, and the system recognizes it and surfaces translations in multiple languages as floating spatial labels.

## Core Features

- **Real-time object recognition** using AI (Gemini Vision / ML Kit / ONNX)
- **Floating multilingual labels** anchored over detected objects in space
- **Dynamic language switching** via UI, voice commands, or gestures
- **Quiz mode** — identify or match objects to their translations

## Stretch Goals

- **Text-to-speech pronunciation** for each detected word
- **History log** of detected objects and learned words across sessions
- **Gamification** — streaks, achievements, learning points
- **Adaptive experience** based on user language proficiency level

## Tech Stack

| Tool | Version / Notes |
|---|---|
| Unity | 2022.3 LTS |
| Meta XR SDK | v76 |
| Gemini Vision API / ML Kit / YOLOv5 ONNX | object detection |
| Google Translate API / Gemini | multilingual translation |
| TextMeshPro | sharp spatial UI labels |
| Spatial Anchors | accurate label placement in the environment |

## Who It's For

- **Travelers** learning everyday vocabulary on the go
- **Language students** who learn better through real-life context
- **Professionals** in multilingual environments needing quick translation support

---

Built by [Benjamin Pareja](https://xrlabs.lat) · [XR Labs](https://xrlabs.lat)
