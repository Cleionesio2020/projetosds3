import Dashboard from "dashboard";
import Home from "home";
import { BrowserRouter, Switch, Route } from "react-router-dom";

export default function Router() {
  return (
    <BrowserRouter>
      <Switch>
        <Route exact path="/">
          <Home />
        </Route>

        <Route path="/dashboard">
          <Dashboard />
        </Route>

      </Switch>
    </BrowserRouter>
  );
}
