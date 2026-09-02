# Personal Bank Ledger and Statement Generator — final documentation

## Purpose and safe scope

This PSPJ console project teaches fundamental Java programming through **fictional** ledger entries. It is only a classroom exercise: it does not connect to a bank, process real payments, store real customer data, provide account security, or give financial advice.

## Final capability

The final program begins with a fictional opening balance, processes one deposit and two expenses, and reports the closing balance, totals, largest debit, and category counts. Earlier weeks progressively introduce console output, arithmetic, loops, methods, arrays, validation, recursion, objects, exceptions, CSV files, collections, and streams.

## Weekly implementation and proof map

| Week | PSPJ focus | Runnable class | Evidence |
| --- | --- | --- | --- |
| 01 | Variables and formatted output | `BankLedger` | `week-01/OUTPUT.txt` |
| 02 | Arithmetic calculation | `TransactionBalance` | `week-02/OUTPUT.txt` |
| 03 | Loop-driven statement | `MiniStatement` | `week-03/OUTPUT.txt` |
| 04 | Menu-shaped `while` loop | `BankWeek04` | `week-04/OUTPUT.txt` |
| 05 | Reusable methods | `BankWeek05` | `week-05/OUTPUT.txt` |
| 06 | Arrays and lookup | `BankWeek06` | `week-06/OUTPUT.txt` |
| 07 | Guard clauses and edge cases | `BankWeek07` | `week-07/OUTPUT.txt` |
| 08 | Recursion | `BankWeek08` | `week-08/OUTPUT.txt` |
| 09 | Classes, objects, encapsulation | `BankWeek09` | `week-09/OUTPUT.txt` |
| 10 | Exceptions and validation | `BankWeek10` | `week-10/OUTPUT.txt` |
| 11 | CSV persistence and reload | `BankWeek11` | `week-11/OUTPUT.txt`, `week-11/ledger.csv` |
| 12 | Collections and streams final report | `BankLedger` | `week-12/OUTPUT.txt` |

Each weekly folder also includes `PROCEDURE.md` and `TRACE.md`, so a learner can reproduce the result and inspect the calculation path.

## Run instructions

Use a Java 21 (or compatible Java) JDK. From an individual `week-XX` directory, compile and run the listed class. For example:

```text
javac BankWeek10.java
java BankWeek10
```

For Week 12:

```text
javac BankLedger.java
java BankLedger
```

Compare the terminal result with that week’s `OUTPUT.txt`. Week 11 creates or overwrites the fictional local `ledger.csv` sample in its own folder before reloading it.

## Verification checklist

- [x] One independent Java source file is present for every week.
- [x] Each source file is designed to compile and run from its own week folder.
- [x] Each week has a procedure, trace, and expected console-output proof.
- [x] The Week 12 summary is internally consistent: `12500 + 1500 - 2000 - 350 = 11650`.
- [x] All sample account holder, dates, transactions, and balances are fictional teaching data.
