# Stock RSI Checker API

## Overview
This Spring Boot application provides an API to fetch the latest weekly Relative Strength Index (RSI) values for given stock tickers. It's designed to help traders and investors quickly assess the momentum of selected stocks.

## Prerequisites
- JDK 11 or later
- Maven 3.2+ (for building and running the project)
- An IDE (like IntelliJ IDEA, Eclipse, or Spring Tool Suite) for development

## Getting Started

### Setting Up the Project
1. Clone the repository:
2. Open the project in your IDE.
3. Ensure that Maven dependencies are properly downloaded and set up in the project.

### Configuration
1. Update `application.yaml` with necessary configurations, including any API keys if required.
2. Make sure to configure the email settings if the email feature is used in the application.

### Running the Application
- To run the application, use the following Maven command:
- Alternatively, run the application from your IDE using the main class `RsiSignalSenderApplication.java`.

## API Usage

### Get Weekly RSI
- **Endpoint**: `/rsi/{ticker}`
- **Method**: GET
- **Description**: Fetches the latest weekly RSI value for the specified stock ticker using the Alpha Vantage API.
- **Path Variable**: `{ticker}` is the stock ticker symbol (e.g., 'AMZN', 'NVDA').

### Example Request
- **URL**: `http://localhost:24001/rsi/AMZN`

### Testing the API
- You can test the API using tools like Postman or curl:

## Contributing
Contributions to this project are welcome. Please fork the repository and submit a pull request for any enhancements or bug fixes.

## License
This project is licensed under the Apache License 2.0 - see the [LICENSE](https://www.apache.org/licenses/LICENSE-2.0) file for details.