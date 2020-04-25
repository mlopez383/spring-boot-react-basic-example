import React from 'react';
import logo from './logo.svg';
import './App.css';

class App extends React.Component {
	constructor() {
		super();
		this.state = {mensaje: ""};
	}

	componentDidMount() {
		fetch('http://localhost:3001/hello')
		.then(res => res.json())
		.then((data) => {
			this.setState({
				mensaje: data
			});
		})
		.catch(console.log);
	}

	render(){
		return (
				<div className="App">
				<header className="App-header">
				<p>{this.state.mensaje}</p>
				<img src={logo} className="App-logo" alt="logo" />
					</header>
				</div>
		);
	}
}

export default App;
