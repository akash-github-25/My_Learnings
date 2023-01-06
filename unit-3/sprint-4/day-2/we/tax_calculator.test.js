// import { test } from "picomatch"
// import { expect } from "@jest/globals"
import calculatetax from "./tax_calculator.js"
test("calculate",()=>{
    expect(calculatetax(2000000)).toBe(50000)
})