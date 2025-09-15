#!/bin/bash
jar cfe calc.jar Calc Calc.class
mkdir -p ~/.local/lib/calc
mv calc.jar ~/.local/lib/calc/
mkdir -p ~/.local/bin
cp calc ~/.local/bin/
echo "calc installed"
