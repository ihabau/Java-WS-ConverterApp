![Lexicon Logo](https://lexicongruppen.se/media/wi5hphtd/lexicon-logo.svg)

# Workshop – Converter App

## The Scenario
- [Objectives](./Java2_Workshop_Converter.md)

## Checklist

### Core Setup
1. [ ] Create `ConverterApp.java` in `src/main/java/se/lexicon/`
2. [ ] Define all conversion rates and fixed values as `final` constants at the top
3. [ ] Organise logic into methods (one per converter)
4. [ ] Commit regularly as you make progress

### Main Menu & Navigation
5. [ ] Display a numbered menu showing your 3 chosen converters + Exit option
6. [ ] For multi-direction converters, show a sub-menu for the user to choose
7. [ ] Keep running until the user chooses to exit

### Pick Your 3 Converters
8. [ ] Currency Converter (SEK → USD / SEK → EUR)
9. [ ] Temperature Converter (°C → °F / °F → °C)
10. [ ] Length Converter (cm → m / m → km)
11. [ ] Weight Converter (kg → g / kg → lb)
12. [ ] Time Converter (h → min / min → sec)
13. [ ] Speed Converter (km/h → m/s / m/s → km/h)
14. [ ] Data Storage Converter (KB → MB / MB → GB)
15. [ ] BMI Calculator (weight + height → BMI + category)
16. [ ] Fuel Consumption Converter (L/100km → km/L / km/L → L/100km)
17. [ ] Grade Converter (score 0–100 → A–F grade)

### User Interaction
18. [ ] Ask user to enter a value
19. [ ] Calculate and display result in a formatted line
20. [ ] After each conversion, ask: continue or exit?
21. [ ] Show `Goodbye!` on exit

### Output Format
22. [ ] Match the sample session output format exactly
23. [ ] Display `Result: X.XX unit = Y.YY unit` for conversions
24. [ ] For BMI: display `BMI: X.XX  ->  Category`

### Optional Challenges
25. [ ] **Challenge 1:** Input validation (reject non-numeric, invalid menu choices, negative values where inappropriate)
26. [ ] **Challenge 2:** Session history (print summary on exit)
27. [ ] **Challenge 3:** Add timestamps to each conversion




