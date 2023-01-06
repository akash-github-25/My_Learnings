// import { expect } from "expect"
// import { test } from "picomatch"
import time from "./time.js"
test("time cal",()=>{
    expect(time(3786999)).toBe("1 hours 3 minutes 6 seconds")
})