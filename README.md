![Lexicon Logo](https://lexicongruppen.se/media/wi5hphtd/lexicon-logo.svg)

# Workshop – Converter App

## The Scenario
- [Objectives](./Java2_Workshop_Converter.md)

## Checklist

### Core Setup
1. [x] Create `ConverterApp.java` in `src/main/java/se/lexicon/`
2. [x] Define all conversion rates and fixed values as `final` constants at the top
3. [x] Organise logic into methods (one per converter)
4. [x] Commit regularly as you make progress

### Main Menu & Navigation
5. [x] Display a numbered menu showing your 3 chosen converters + Exit option
6. [x] For multi-direction converters, show a sub-menu for the user to choose
7. [x] Keep running until the user chooses to exit

### Pick Your 3 Converters
8. [x] Currency Converter (SEK → USD / SEK → EUR)
9. [x] Temperature Converter (°C → °F / °F → °C)
10. [x] Length Converter (cm → m / m → km)
11. [x] Weight Converter (kg → g / kg → lb)
12. [x] Time Converter (h → min / min → sec)
13. [x] Speed Converter (km/h → m/s / m/s → km/h)
14. [x] Data Storage Converter (KB → MB / MB → GB)
15. [x] BMI Calculator (weight + height → BMI + category)
16. [ ] Fuel Consumption Converter (L/100km → km/L / km/L → L/100km)
17. [ ] Grade Converter (score 0–100 → A–F grade)

### User Interaction
18. [x] Ask user to enter a value
19. [x] Calculate and display result in a formatted line
20. [x] After each conversion, ask: continue or exit?
21. [x] Show `Goodbye!` on exit

### Output Format
22. [x] Match the sample session output format exactly
23. [x] Display `Result: X.XX unit = Y.YY unit` for conversions
24. [x] For BMI: display `BMI: X.XX  ->  Category`

### Optional Challenges
25. [x] **Challenge 1:** Input validation (reject non-numeric, invalid menu choices, negative values where inappropriate)
26. [x] **Challenge 2:** Session history (print summary on exit)
27. [x] **Challenge 3:** Add timestamps to each conversion




